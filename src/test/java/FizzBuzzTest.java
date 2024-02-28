import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Map<Integer, String> numero = new HashMap<>();

    @Before
    public void setUp(){
        for(int i = 1; i <= 21; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                String palabra = "";
                if(i % 3 == 0){
                    palabra += "Fizz";
                    numero.put(i,palabra );
                }if(i % 5 == 0){
                    palabra += "Buzz";
                    numero.put(i, palabra);
                }
            }else{
                numero.put(i, String.valueOf(i));
            }
        }
    }

    @Test
    public void probarTodos(){
        //Arrange
        Integer radom = (int) (Math.random()*(21-1+1) + 1);

        //act
        String stringEsperado = numero.get(radom);
        String stringObtenido = fizzBuzz.jugar(radom);

        //assert
        Assert.assertEquals(stringEsperado, stringObtenido);
    }

    @Test
    public void comprobarNumeroDivisibleTres(){

        //Arrange
        Integer numero =  3;

        //Act
        String fizz = fizzBuzz.jugar(numero);

        //Assert
        Assert.assertEquals("Fizz", fizz);
    }

    @Test
    public void comprobarNumeroDivisibleCinco(){
        //Arrange
        Integer numero =  5;

        //Act
        String buzz = fizzBuzz.jugar(numero);

        //Assert
        Assert.assertEquals("Buzz", buzz);
    }

    @Test
    public void comprobarNumeroDivisibleTresAndCinco(){
        //Arrange
        Integer numero = 15;

        //Act
        String FizzBuzz = fizzBuzz.jugar(numero);

        //Assert
        Assert.assertEquals("FizzBuzz", FizzBuzz);
    }

    @Test
    public void noEsDivivisible(){
        //Arrange
        Integer numero =  1;

        //Act
        String FizzBuzz = fizzBuzz.jugar(numero);

        //Assert
        Assert.assertEquals(String.valueOf(numero), FizzBuzz);
    }


}
