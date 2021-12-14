//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.OrdenResponde;
////import com.example.demo.dto.ordenrequest;
//import com.example.demo.model.Pedido_Oracion;
//import com.example.demo.repository.OracionRespository;
//import com.example.demo.repository.Pedido_OracionRespository;
//
////@RestController
//@EnableJpaRepositories
//@RestController
//@RequestMapping("/ru")
//public class OracionController {
//	   @Autowired
//	   private Pedido_OracionRespository pedido_oracionrepository;
//	   @Autowired
//	   private OracionRespository oracionrespository;
//	   
////	   @PostMapping("/placeOrder")
////	    public Pedido_Oracion placeOrder(@RequestBody ordenrequest request){
////	       return oracionrespository.save(request.getCustomer());
////	    }
//	   
//	   @GetMapping("/to")
//	    public List<Pedido_Oracion> findAllOrders(){
//	        return oracionrespository.findAll();
//	    }
//
//	    @GetMapping("/todo")
//	    public List<OrdenResponde> getJoinInformation(){
//	        return oracionrespository.getJoinInformation();
//	    }
//
//		public Pedido_OracionRespository getPedido_oracionrepository() {
//			return pedido_oracionrepository;
//		}
//
//		public void setPedido_oracionrepository(Pedido_OracionRespository pedido_oracionrepository) {
//			this.pedido_oracionrepository = pedido_oracionrepository;
//		}
//	   
//}
