package br.com.uvass.curso.repository;

import br.com.uvass.curso.model.entity.Venda;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaMapper implements RowMapper<Venda> {

    @Override
    public Venda mapRow(ResultSet resultSet, int i) throws SQLException {
        Venda venda = new Venda();
        venda.setId(resultSet.getInt("id"));
        venda.setValor(resultSet.getFloat("valor"));
        venda.setData(resultSet.getString("data"));
        venda.setComprador(resultSet.getInt("comprador"));
        venda.setVendedor(resultSet.getInt("vendedor"));
        venda.setCurso(resultSet.getInt("curso"));
        return venda;
    }

}