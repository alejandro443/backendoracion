//package com.example.demo.repository;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.model.Pedido_Oracion;
//
//
//@Repository
//public interface RepositoryPerso extends JpaRepository<Pedido_Oracion, Integer>{
//	
////	 @Query(value = "{CALL SP_LISTA_COMENTARIO()}", nativeQuery = true)
////	 List<Map<String , Object>> listaProcedure();
//
////	 @Query(value = "     SELECT p.oracion,b.id_perso,w.nombre\r\n"
////	 		+ "FROM TBL_PEDIDO_ORACION P \r\n"
////	 		+ "JOIN tbl_beneficiario b join tbl_persona w\r\n"
////	 		+ "on b.id_perso= w.idpersona\r\n"
////	 		+ "ON p.id_beneficiario=b.id_beneficiario", nativeQuery = true)
////	 List<Map<String , Object>> listaProcedure();
////	 
////	 
//	    @Query(value = "{ CALL SP_LISTA_COMENTARIO}", nativeQuery   = true)
//	    List<Map<String, Object>>  SP_LISTA_COMENTARIO();
//
//}
