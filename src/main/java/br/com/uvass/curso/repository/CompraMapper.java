package br.com.uvass.curso.repository;

import br.com.uvass.curso.model.entity.Compra;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompraMapper implements RowMapper<Compra> {

    @Override
    public Compra mapRow(ResultSet resultSet, int i) throws SQLException {
        Compra compra = new Compra();
        compra.setId(resultSet.getInt("id"));
        compra.setValor(resultSet.getFloat("valor"));
        compra.setData(resultSet.getString("data"));
        compra.setComprador(resultSet.getInt("comprador"));
        compra.setVendedor(resultSet.getInt("vendedor"));
        compra.setCurso(resultSet.getInt("curso"));
        return compra;
    }

}

