package com.weshopify.platform.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weshopify.platform.Bean.ProductBean;
import com.weshopify.platform.Entity.Product;
import com.weshopify.platform.Entity.Qauntity;
import com.weshopify.platform.Repo.ProductRepo;
import com.weshopify.platform.Repo.QauntityRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Autowired
	QauntityRepo qauntityRepo;

	@Override
	public List<ProductBean> listAllProducts() {
		List<Product> products = productRepo.findAll();
		List<ProductBean> productBeans = new ArrayList<ProductBean>();
		products.stream().forEach(product -> {
			ProductBean bean = new ProductBean();
			BeanUtils.copyProperties(product, bean);
			int quntity = qauntityRepo.findById( product.getProductIMEI() ).get().getQauntity();
			bean.setQauntityResereved(quntity);
			productBeans.add(bean);
		});
		return productBeans;
	}

	@Override
	public ProductBean createProduct(ProductBean productBean) {
		Product product = new Product();
		String imeiNumber = UUID.randomUUID().toString();
		product.setProductIMEI(imeiNumber);
		BeanUtils.copyProperties(productBean, product);
		productRepo.save(product);
		Qauntity qauntity = new Qauntity();
		qauntity.setProductId(product.getId());
		qauntity.setId(product.getProductIMEI());
		qauntity.setQauntity(productBean.getQauntityResereved());
		qauntityRepo.save(qauntity);
		BeanUtils.copyProperties(product, productBean);
		return productBean;
	}

	@Override
	public List<ProductBean> deleteProducts(List<Integer> list) {

		list.forEach(id -> {
			deleteAProduct(id);
		});

		return Optional.of(listAllProducts()).orElseGet(ArrayList::new);
	}

	@Override
	public void deleteAProduct(int productId) {
		Product product = productRepo.findById(productId).get();
		String imeiId = product.getProductIMEI();
		Qauntity q = qauntityRepo.findById(imeiId).get();
		qauntityRepo.delete(q);
		productRepo.delete(product);

	}

	@Override
	public ProductBean reserveProduct(int id, int desiredQauntity) {
		Product product = productRepo.findById(id).get();
		String imei = product.getProductIMEI();

		Qauntity q = qauntityRepo.findById(imei).get();
		int qauntity = q.getQauntity();

		if (qauntity > desiredQauntity) {

			qauntity -= desiredQauntity;
		} else {
			throw new RuntimeException("Desire qauntity of the product is not available in store");
		}
		q.setQauntity(qauntity);
		qauntityRepo.save(q);

		ProductBean productBean = new ProductBean();
		BeanUtils.copyProperties(product, productBean);
		productBean.setQauntityResereved(desiredQauntity);
		productBean.setStatus("Reserved");
		return productBean;
	}

}
