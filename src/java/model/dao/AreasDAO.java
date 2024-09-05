/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Areas;

/**
 *
 * @author Senai
 */
public class AreasDAO {

    public List<Areas> listar() {
        List<Areas> areas = new ArrayList();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("SELECT * FROM professor");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Areas area = new Areas();
                area.setId_area(rs.getInt("id_area"));
                area.setNome(rs.getString("nome"));

                areas.add(area);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (areas);
    }
}
