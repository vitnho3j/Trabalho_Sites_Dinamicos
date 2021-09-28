package br.com.uvass.curso.repository;
import br.com.uvass.curso.model.entity.Compra;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CompraRepository {

    private JdbcTemplate jdbcTemplate;

    public CompraRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Compra inserir(Compra compra) throws Exception{
        String sql = "insert into compra(id, data, valor, comprador, vendedor, curso) values(?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                compra.getId(),
                compra.getData(),
                compra.getValor(),
                compra.getComprador(),
                compra.getVendedor(),
                compra.getCurso());


        if (insert == 1){
            return compra;
        }
        throw new Exception("A compra não foi realizada com sucesso");
    }

}
