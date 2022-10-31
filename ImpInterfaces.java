/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 211-000294
 */
public class ImpInterfaces {
    
    public static void main(String[] args) {
        Database bancoDeDados = new DatabaseMariaDB();
        
        bancoDeDados.conectar();
        bancoDeDados.salvar();
    }
    
}
