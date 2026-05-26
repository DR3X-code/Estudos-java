package intermediario_01.exceptions.validador;

import intermediario_01.exceptions.custom.FalhaValidacaoCheckedException;
import intermediario_01.exceptions.custom.RegraInvalidaException;

public class ValidadorCadastro {

    private ValidadorCadastro(){    }
    public static void validarDocumentoObrigatorio(String documento) throws FalhaValidacaoCheckedException {
        if (documento == null || documento.isBlank()){
            throw new FalhaValidacaoCheckedException("Documento obrigatorio !");
        }

        //aplicação vai força a tratativa
    }
    public static void validarTamanhoNome(String nome){
        if (nome == null || nome.length() < 3 ){
            throw new RegraInvalidaException("Nome não atingiu tamanho minimo");
        }
        //aplicação vai continuar rodando
    }
    public static void validarIdadeMinima(int idade){
        if(idade < 18 ){
            throw new RegraInvalidaException("Não possui idade minima");
        }
        //aplicação vai continuar rodando

    }
}
