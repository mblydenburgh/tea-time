package com.mblydenburgh.teatime.dao.repositories

import com.mblydenburgh.teatime.dao.entities.TeaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeaRepository: JpaRepository<TeaEntity, String>