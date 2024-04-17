package br.com.rest.restwithspringbootandjava.controllers;

import br.com.rest.restwithspringbootandjava.converters.NumberConverter;
import br.com.rest.restwithspringbootandjava.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class MathController {

    private static  final AtomicLong  counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();
    @RequestMapping(value = "/soma/{numberOne}/{numberTwo}",
    method = RequestMethod.GET)
    public  Double sum(
            @PathVariable(value = "numberOne")  String numberOne ,
            @PathVariable(value = "numberTwo")  String numberTwo
            )throws Exception {
            if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
                throw new UnsupportedOperationException("Please set a numeric value ");
            }
        return  math.soma( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/subtração/{numberOne}/{numberTwo}")
    @GetMapping
    public  Double sub (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws  Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value ");
        }
        return  math.subtracao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value = "/multiplicação/{numberOne}/{numberTwo}")
    @GetMapping
    public  Double multi (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws  Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value ");
        }
        return  math.multiplicacao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value = "/divisão/{numberOne}/{numberTwo}")
    @GetMapping
    public  Double divi (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws  Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value ");
        }
        return  math.divisao(NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value = "/media/{numberOne}/{numberTwo}")
    @GetMapping
    public  Double media (
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws  Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedOperationException("Please set a numeric value ");
        }
        return math.media( NumberConverter.convertToDouble(numberOne) , NumberConverter.convertToDouble(numberTwo));

    }

    @RequestMapping(value = "/raizQuadrada/{number}")
    @GetMapping
    public  Double raizQuadrada (
            @PathVariable(value = "number") String number
    ) throws  Exception {
        if (!NumberConverter.isNumeric(number)){
            throw new UnsupportedOperationException("Please set a numeric value ");
        }
         return math.raizQuadrada(NumberConverter.convertToDouble(number));

    }


}
