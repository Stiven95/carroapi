package br.com.stiven.carroapi.service

import br.com.stiven.carroapi.model.Carro
import br.com.stiven.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarros() : List<Carro> {
        return carroRepository.findAll()
    }

    fun buscaCarroPorAno(ano: Int) : List<Carro> {
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorMarca(marca: String) : List<Carro> {
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorPlaca(placa: String) : Carro {
        return carroRepository.findByPlaca(placa)
    }

    fun salvar(carro: Carro) {
        carroRepository.save(carro)
    }
}