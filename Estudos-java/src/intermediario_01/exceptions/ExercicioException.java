package intermediario_01.exceptions;

import intermediario_01.exceptions.custom.FalhaValidacaoCheckedException;
import intermediario_01.exceptions.custom.RegraInvalidaException;
import intermediario_01.exceptions.validador.ValidadorCadastro;

public class ExercicioException {

    public static void main(String[] args) {
        executarAula();


    }
    private static void executarAula(){
        System.out.println("--- Exceções  ---");
        demonstrarChecked();
        demonstrarUnchecked();
        demonstrarCustomException();



    }

    private static void demonstrarChecked(){
        System.out.println("--- checked: o compilador obriga a tratativa,tratar ou propagar  ---");
        try {
            ValidadorCadastro.validarDocumentoObrigatorio("");
            System.out.println("Documento Valido");
        } catch (FalhaValidacaoCheckedException e) {
            System.out.println("Mensagem de erro : " + e.getMessage());
        }
    }
    private static void demonstrarUnchecked() {
        System.out.println("--- Unchecked: o compilador não obriga usar o try catch  ---");
        try {
            ValidadorCadastro.validarTamanhoNome("An");
            System.out.println("Nome Correto");
        } catch (RegraInvalidaException e) {
            System.out.println("Mensagem de erro : " + e.getMessage());
        }
    }
    private static void demonstrarCustomException(){
        System.out.println("--- Custom de negocio ---");
        try {
            ValidadorCadastro.validarIdadeMinima( 17 );
            System.out.println("idade Correto");
        } catch (RegraInvalidaException e) {
            System.out.println("Mensagem de erro : " + e.getMessage());
        }
    }

}
