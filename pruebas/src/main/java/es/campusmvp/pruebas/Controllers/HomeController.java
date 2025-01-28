package es.campusmvp.pruebas.Controllers;

import es.campusmvp.pruebas.Jugador.Jugador;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
class HomeController {

    @GetMapping("/")
    public String mostrarHome() {
        return "index";
    }

    @GetMapping("/formularioJugador")
    public String mostrarForm(Model model){
        Jugador jugador = new Jugador();
        model.addAttribute("jugador", jugador);
        return "formularioJugador";
    }

    @PostMapping("/formularioJugador")
    public String registrarJugador(@Valid Jugador jugador, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formularioJugador";
        }

        model.addAttribute(jugador);
        if (jugador.getTipoJugador().equals("INVENCIBLE")) {
            return "resultadoInvencible";
        } else {
            return "resultados";
        }
    }
}