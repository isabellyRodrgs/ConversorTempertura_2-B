//  Herança quando reaproveitamos atributos em comum para outras classes 
public class Temperatura {
    //Atributo privado para armazenar temperatura em celsius
    private double tempCelsius;
    
    //Construtor cria objetos com uma temperatura inicial
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
    }
    
        //Getter para ler temperatura
        public double getTemperatura(){
            return tempCelsius;
    }
        //Setter para mudar a temperatura
        public void setTemperaturaCelsius(double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;
        }
        
        //Método para converter para fahrenheit
        public double converterParaFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
        
        //Método para converter de Celsius para Kelvin
        public double converterParaKelvin(){
            return tempCelsius+273.15;
        }
}
