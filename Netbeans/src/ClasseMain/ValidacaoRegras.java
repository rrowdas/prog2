/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMain;

/**
 *
 * @author victor
 */
public class ValidacaoRegras {

    public boolean validaCpf(String cpf) {
        char[] vetor = cpf.toCharArray();
        boolean numDigitoValido = true;
        boolean inteiro = true;

        if (vetor.length != 11) {
            numDigitoValido = false;
        }

        for (int i = 0; i < vetor.length && inteiro && numDigitoValido; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(vetor[i])) {
                inteiro = false;
            }
        }
        if (numDigitoValido == false || inteiro == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validaCnpj(String cnpj) {
        char[] vetor = cnpj.toCharArray();
        boolean numDigitoValido = true;
        boolean inteiro = true;

        if (vetor.length != 14) {
            numDigitoValido = false;
        }

        for (int i = 0; i < vetor.length && inteiro && numDigitoValido; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(vetor[i])) {
                inteiro = false;
            }
        }
        if (numDigitoValido == false || inteiro == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validaCodigo(String codigo) {
        char[] vetor = codigo.toCharArray();
        boolean numDigitoValido = true;
        boolean inteiro = true;

        if (vetor.length != 6) {
            numDigitoValido = false;
        }

        for (int i = 0; i < vetor.length && inteiro && numDigitoValido; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(vetor[i])) {
                inteiro = false;
            }
        }
        if (numDigitoValido == false || inteiro == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validaDia(String dia) {
        int valor = Integer.parseInt(dia);

        if (validaDigito(dia)) {

            if (valor < 31 && valor > 0)
                return true;
            else 
                return false;
        } 
        else 
            return false;
    }

    public boolean validaMes(String mes) {
        int valor = Integer.parseInt(mes);
        
        if(validaDigito(mes)){
            if (valor < 12 && valor > 0) 
                return true;
            else 
             return false;
        }
        else
            return false;
    }

    public boolean validaDigito(String frase) {
        char[] vetor = frase.toCharArray();
        boolean inteiro = true;

        for (int i = 0; i < vetor.length; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(vetor[i])) {
                inteiro = false;
            }
        }
        if (inteiro == false) {
            return false;
        } else {
            return true;
        }

    }
    
    public boolean validaFormaPagamento(String novaFormaPagamento){
        if (novaFormaPagamento.equalsIgnoreCase("dinheiro") || novaFormaPagamento.equalsIgnoreCase("debito")
                || novaFormaPagamento.equalsIgnoreCase("credito")) {
            return true;
        } 
        else {
            System.out.println("Voce deve colocar debito, credito ou dinheiro. Digite novamente.");
            return false;
        }
    }

}
