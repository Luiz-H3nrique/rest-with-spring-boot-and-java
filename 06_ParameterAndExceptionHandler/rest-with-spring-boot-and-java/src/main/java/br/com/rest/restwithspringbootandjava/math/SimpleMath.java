package br.com.rest.restwithspringbootandjava.math;

import br.com.rest.restwithspringbootandjava.converters.NumberConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {


    public  Double soma( Double numberOne , Double numberTwo ) {

        return  numberOne + numberTwo;
    }

    public  Double subtracao ( Double numberOne, Double numberTwo) {
        return  numberOne - numberTwo;
    }

    public  Double multiplicacao ( Double numberOne, Double numberTwo )  {

        return  numberOne  *  numberTwo;
    }


    public  Double divisao ( Double numberOne, Double numberTwo )  {

        return  numberOne  / numberTwo ;
    }

    public  Double media ( Double numberOne, Double numberTwo )  {

        return  ( numberOne  +  numberTwo ) / 2;

    }


    public  Double raizQuadrada ( Double number)   {
        return Math.sqrt(number);

    }
}
