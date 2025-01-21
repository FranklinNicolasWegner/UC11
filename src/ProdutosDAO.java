/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    
    
  
    
       public List<ProdutosDTO> getProduto(){
       conectaDAO conectadao = new conectaDAO();
       conectadao.Connection();
       
       
       String sql = "Select produtos.id as id, nome, valor, status from produtos where status = 'A Venda'";
   
   try{
       PreparedStatement stmt = conectadao.conn.prepareStatement(sql);
       
       ResultSet rs = stmt.executeQuery();
       List<ProdutosDTO> lista = new ArrayList<>();
       while(rs.next()){
           ProdutosDTO produtosdto = new ProdutosDTO();
           produtosdto.setId(rs.getInt("id"));
           produtosdto.setNome(rs.getString("nome"));
           produtosdto.setValor(rs.getInt("valor"));
           produtosdto.setStatus(rs.getString("status"));
           
           lista.add(produtosdto);
       
       }
       
       return lista;
       
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Erro ao consultar lista");
       return null;
   }
   
   
       
   }
    
        public List<ProdutosDTO> getProdutoVenda(){
       conectaDAO conectadao = new conectaDAO();
       conectadao.Connection();
       
       
       String sql = "Select produtos.id as id, nome, valor, status from produtos where status = 'Vendido'";
   
   try{
       PreparedStatement stmt = conectadao.conn.prepareStatement(sql);
       
       ResultSet rs = stmt.executeQuery();
       List<ProdutosDTO> lista = new ArrayList<>();
       while(rs.next()){
           ProdutosDTO produtosdto = new ProdutosDTO();
           produtosdto.setId(rs.getInt("id"));
           produtosdto.setNome(rs.getString("nome"));
           produtosdto.setValor(rs.getInt("valor"));
           produtosdto.setStatus(rs.getString("status"));
           
           lista.add(produtosdto);
       
       }
       
       return lista;
   
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Erro ao consultar lista");
       return null;
   }
   
   
       
   }





}

