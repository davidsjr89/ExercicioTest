public class Matricula {
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

    public String GetAcademia(String letraDaAcademia){
        String academiaSelecionada = "";
        switch (letraDaAcademia){
            case "M":
                academiaSelecionada = "Matriz";
                break;
            case  "F":
                academiaSelecionada = "Filial";
                break;
            default:
                academiaSelecionada = "";
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

}
