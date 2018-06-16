/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import com.mycompany.help_me.CRUD.AjudaProcessoCRUD;
import com.mycompany.help_me.CRUD.LocalCRUD;
import com.mycompany.help_me.CRUD.UsuarioCRUD;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clecio
 */
public class Ajuda {
    private int id;
    private String titulo;
    private String descricao;
    private int idUsuario;
    private int idLocal;
    private String tipo;
    private Local local;
    private Local localProximo;
    private List<AjudaProcesso> emProcesso;
    public Ajuda() {
    }

    public Ajuda(int id) throws Exception {
        setId(id);
    }

    public Ajuda(int id, String titulo, String descricao, int idUsuario, int idLocal, String tipo) throws Exception {
        setId(id);
        this.titulo = titulo;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
        setIdLocal(idLocal);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        this.id = id;
        AjudaProcessoCRUD apc = new AjudaProcessoCRUD();
        emProcesso = apc.ListaAjudaProcessos(id,"idAjuda");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) throws Exception {
        this.idLocal = idLocal;
        LocalCRUD lc = new LocalCRUD();
        local = lc.GetLocal(idLocal);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<AjudaProcesso> getEmProcesso() {
        return emProcesso;
    }

    public void setEmProcesso(List<AjudaProcesso> emProcesso) {
        this.emProcesso = emProcesso;
    }

    public Local getLocalProximo() {
        return localProximo;
    }

    public void setLocalProximo(Local localProximo) {
        this.localProximo = localProximo;
    }
    
}