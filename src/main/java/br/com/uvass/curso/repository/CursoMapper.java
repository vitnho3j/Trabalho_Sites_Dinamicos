package br.com.uvass.curso.repository;

import br.com.uvass.curso.model.entity.Curso;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CursoMapper implements RowMapper<Curso> {

    @Override
    public Curso mapRow(ResultSet resultSet, int i) throws SQLException {
        Curso curso = new Curso();
        curso.setId(resultSet.getInt("id"));
        curso.setNome(resultSet.getNString("nome"));
        curso.setCategoria(resultSet.getString("categoria"));
        curso.setValor(resultSet.getFloat("valor"));
        curso.setId_creator(resultSet.getInt("id_creator"));
        return curso;
    }

}
