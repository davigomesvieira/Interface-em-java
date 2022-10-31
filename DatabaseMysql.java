/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 211-000294
 */
public class DatabaseMysql implements Database {
    
   @Override 
   public void conectar(){
       System.out.println( "Conectando no MYSQL");
   }

    @Override
    public void salvar() {
        System.out.println( "Salvando no MYSQL");
    }

    @Override
    public void ler() {
       System.out.println( "Lendo no MYSQL");
   }
    
}
