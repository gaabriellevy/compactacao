/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compactacao;

/**
 *
 * @author aluno
 */
public class Compactador {
    
    public String frequenciaCaracteres(String entrada) {
        StringBuilder comprimido = new StringBuilder();
        
        int ocorrencias = 1;
        for (int i = 0; i < entrada.length(); i++) {
            if (i < entrada.length() - 1 && entrada.charAt(i) == entrada.charAt(i + 1)) {
                ocorrencias++;
            }/*else if(entrada.charAt(i) == '\n') { // substituir \n por LP
                comprimido.append(ocorrencias);
                comprimido.append('L');
                comprimido.append('P');
                ocorrencias = 1; // reseta counter
            } */
            else {
                if (ocorrencias==1)
                    comprimido.append(entrada.charAt(i));
                else{
                    comprimido.append(ocorrencias);
                    comprimido.append(entrada.charAt(i));
                    ocorrencias = 1; // reseta counter
                }
            }
        }
        
        return comprimido.toString();
        
    }
    
}
