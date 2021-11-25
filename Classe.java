public class Carro implements Motor, Veiculo{

    @Override
    public String getFabricante(){
        return "Toyota";
    }

    @Override
    public String getModelo(){
        return "Sprinter Trueno";
    }

    @Override
    public int getId(){
        return 7;
    }

    @Override
    public String getNome(){
        return "João";
    }
}