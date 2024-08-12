package com.RuanPablo1.TaskManagerapp.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.RuanPablo1.TaskManagerapp.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_tarefas")
public class Tarefa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tarefa")
	private Long idTarefa;
	
	@Column
	private String titulo;
	
	@Column
	private String descricao;
	
	@Column
	private LocalDateTime dataCriacao;
	
	@Column
	private Status status;
	
	@ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;	
}