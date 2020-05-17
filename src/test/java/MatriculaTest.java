import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import static org.mockito.Matchers.any;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Matricula.class)

public class MatriculaTest {
    @Test
    public void testeAdiciona_NomeCursoAcademiaSituacaoAPreenchidos(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia('F');
        String esperado = "Cadastro com Sucesso";
        String atual = "";
        //Act
        atual = matricula.Adiciona("David", "Natação",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }
    @Test
    public void testeAdiciona_NomeCursoAcademiaSituacaoBPreenchidos(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia('M');
        String esperado = "Cadastro com Sucesso";
        String atual = "";
        //Act
        atual = matricula.Adiciona("David", "Natação",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }
    @Test
    public void testeAdiciona_NomeNaoPreenchido(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia('A');
        String esperado = "Nome obrigatório";
        String atual = "";
        //Act
        atual = matricula.Adiciona("", "Natação",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void testeAdiciona_AcademiaNaoPreenchido(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia(' ');
        String esperado = "Academia obrigatório";
        String atual = "";
        //Act
        atual = matricula.Adiciona("David", "Natação",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void testeAdiciona_CursoNaoPreenchido(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia(' ');
        String esperado = "Curso obrigatório";
        String atual = "";
        //Act
        atual = matricula.Adiciona("David", "",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void testeAdiciona_NomeCursoAcademiaNaoPreenchidos(){
        //Arrange
        Matricula matricula = new Matricula();
        String academia = matricula.GetAcademia(' ');
        String esperado = "Nome obrigatório";
        String atual = "";
        //Act
        atual = matricula.Adiciona("", "",academia);
        //Assert
        Assert.assertEquals(esperado, atual);
    }
    @Test
    public void testePiscinaLiberada_PiscinaPequena(){
        //Arrange
        Matricula matricula = new Matricula();
        String esperado = "Piscina Pequena";
        String atual = "";
        //Act
        atual = matricula.PiscinaLiberada(7);
        //Assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void testePiscinaLiberada_PiscinaMediaA(){
        //Arrange
        Matricula matricula = new Matricula();
        String esperado = "Piscina Média";
        String atual = "";
        //Act
        atual = matricula.PiscinaLiberada(8);
        //Assert
        Assert.assertEquals(esperado, atual);
    }
    @Test
    public void testePiscinaLiberada_PiscinaMediaB(){
        //Arrange
        Matricula matricula = new Matricula();
        String esperado = "Piscina Média";
        String atual = "";
        //Act
        atual = matricula.PiscinaLiberada(17);
        //Assert
        Assert.assertEquals(esperado, atual);
    }
    @Test
    public void testePiscinaLiberada_PiscinaAdulto(){
        //Arrange
        Matricula matricula = new Matricula();
        String esperado = "Piscina Grande";
        String atual = "";
        //Act
        atual = matricula.PiscinaLiberada(18);
        //Assert
        Assert.assertEquals(esperado, atual);
    }

    @Test
    public void testeDeletaMatricula() throws Exception {
        Matricula matricula = new Matricula();

        final String METHOD = "setAcademia";

        Matricula spy = PowerMockito.spy(matricula);

        PowerMockito.when(spy, METHOD, "Academia Deletada: ").thenReturn((String)"Academia Deletada: ");

        String atual = "";
        String esperado = "Academia Deletada: Filial";

        atual = spy.Delete('F');

        Assert.assertEquals(esperado, atual);


    }


}

