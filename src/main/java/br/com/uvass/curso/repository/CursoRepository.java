package br.com.uvass.curso.repository;
import br.com.uvass.curso.model.entity.Curso;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CursoRepository {

    private JdbcTemplate jdbcTemplate;

    public CursoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Curso inserir(Curso curso) throws Exception{
        String sql = "insert into curso(id, nome, categoria, valor, id_creator) values(?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                curso.getId(),
                curso.getNome(),
                curso.getCategoria(),
                curso.getValor(),
                curso.getId_creator());

        if (insert == 1){
            return curso;
        }
        throw new Exception("O curso não foi inserido com sucesso");
    }

}
