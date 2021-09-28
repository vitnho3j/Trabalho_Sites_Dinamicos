package br.com.uvass.curso.repository;
import br.com.uvass.curso.model.entity.Compra;
import br.com.uvass.curso.model.entity.Venda;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class VendaRepository {

    private JdbcTemplate jdbcTemplate;

    public VendaRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Venda inserir(Venda venda) throws Exception{
        String sql = "insert into venda(id, data, valor, comprador, vendedor, curso) values(?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                venda.getId(),
                venda.getData(),
                venda.getValor(),
                venda.getComprador(),
                venda.getVendedor(),
                venda.getCurso());


        if (insert == 1){
            return venda;
        }
        throw new Exception("A venda não foi realizada com sucesso");
    }

}
