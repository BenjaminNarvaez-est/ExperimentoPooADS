package com.example.poo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.poo.entidades.User

@Dao
interface UsuarioDao {
    @Query("SELECT * FROM User")
    fun obtenerUsuario():List<User>
    @Insert
    fun insertarUsuario(user:User)
    @Query("DELETE FROM User WHERE idUser = :id")
    fun eliminarUsuario(id:Int)
    @Query("UPDATE User set nombreComp = :nombre, email = :email, " +
            "numRepo = :numRepo WHERE idUser = :id")
    fun updateUsuario(id:Int, nombre:String, email:String, numRepo:Int)

}
