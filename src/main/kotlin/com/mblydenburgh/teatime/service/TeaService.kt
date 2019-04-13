package com.mblydenburgh.teatime.service

import com.mblydenburgh.teatime.dao.repositories.TeaRepository
import com.mblydenburgh.teatime.dto.TeaDto
import org.springframework.stereotype.Service
import java.net.URL

@Service
class TeaService(private val teaRepository: TeaRepository){
    fun getTeas():String{
        val result = URL("http://www.google.com").readText()
        println(result)
        return result
    }

    fun returnTeasFromDatabase():List<TeaDto>{
        return teaRepository.findAll().map {
            tea -> TeaDto(
                id = tea.id,
                name = tea.name,
                maker = tea.maker,
                caffeine = tea.caffeine,
                rating = tea.rating)
        }
    }
}