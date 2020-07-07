/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaov
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList<>();  //para criar uma lista é importante instanciar a classe seguindo esse padrão
                                                //q primeiro indica q é uma lista e o tipo dentro do "<>", depois instancia com "ArrayList"  
        list.add("MARIA");                      //método para adicionar componente na lista
        list.add("MARCOS");
        list.add("JOAO");
        list.add("ANA");
        list.add("ROBERTO");
        list.add(2, "MARCELO");                 //adicionando componenete indicando a posição
        list.add(3, "ROBSON");
        
        list.remove("ANA");                     //método para remover um item da lista(indicando oque ta escrito, assim o java identifica)
        list.remove(4);                         //desse método remove o componente da lista tbm, porém indicando so a posição
 
        System.out.println(list.size());        //esse método serve para aparecer na tela qts memebros existem na lista
        System.out.println("Robson está na posição: "); 
        System.out.println(list.indexOf("ROBSON")); //esse método indica em que posição o "ROBSON" está na lista
        for(String x : list){                       //padrão criar esse for para percorrer toda lista (padrão for - each)
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        
        list.removeIf(x -> x.charAt(0) == 'M');     //método que remove todos os itens que possuam o caractere indicado na posição indicada
        for(String x : list){   
            System.out.println(x);
        }
        System.out.println("test");
        
        
        sc.close();
    }
}
    

