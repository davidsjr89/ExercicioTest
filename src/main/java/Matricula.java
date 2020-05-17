public class Matricula {

    public String academiaSelecionada;

    public String setAcademia(String academiaSelecionada) {
        this.academiaSelecionada = academiaSelecionada;
        return this.academiaSelecionada;
    }

    public String getAcademiaName() {
        return academiaSelecionada;
    }

    public String Adiciona(String nome, String curso, String academia){
        if (nome.isEmpty()){
            return "Nome obrigatório";
        }else if (curso.isEmpty()){
            return "Curso obrigatório";
        }else if(academia.isEmpty()){
            return "Academia obrigatório";
        }else {
            return "Cadastro com Sucesso";
        }
    }

    public String GetAcademia(char letraDaAcademia){
        switch (letraDaAcademia){
            case 'M':
               this.academiaSelecionada = "Matriz";
                break;
            case  'F':
                this.academiaSelecionada = "Filial";
                break;
            default:
                this.academiaSelecionada = "";
                break;
        }
        return academiaSelecionada;
    }


    public String PiscinaLiberada(int idade){
        if (idade < 8)
            return "Piscina Pequena";
        else if(idade < 18)
            return "Piscina Média";
        else
            return "Piscina Grande";
    }
    public String VerificaSeAlunoJaEstaMatriculado(String _aluno){
        return "";
    }

    public String Delete(char f) {
        String acao =  getAcademiaName();
        String valor = GetAcademia(f);
        return acao + valor;
    }
}
