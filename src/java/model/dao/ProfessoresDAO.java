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
import model.bean.Professores;

/**
 *
 * @author Senai
 */
public class ProfessoresDAO {

    public Professores validarLogin(Professores profs) {
        Professores professor = new Professores();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = conexao.prepareStatement("select * from professor where cpf=? and senha=?");
            stmt.setString(1, profs.getCpf());
            stmt.setString(2, profs.getSenha());

            rs = stmt.executeQuery();

            if (rs.next()) {
                professor.setId_professor(rs.getInt("id_professor"));
                professor.setNome(rs.getString("nome"));
                professor.setMatricula(rs.getString("matricula"));
                professor.setAdmissao(rs.getDate("admissao"));
                professor.setCpf(rs.getString("cpf"));
                professor.setSenha(rs.getString("senha"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (professor);
    }

    public void cadastrar(Professores prof) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("insert into professor(nome, matricula, admissao, cpf, senha, area) values (?, ?, ?, ?, ?, ?)");

            stmt.setString(1, prof.getNome());
            stmt.setString(2, prof.getMatricula());
            stmt.setDate(3, prof.getAdmissao());
            stmt.setString(4, prof.getCpf());
            stmt.setString(5, prof.getSenha());
            stmt.setInt(6, prof.getArea());

            stmt.executeUpdate();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
