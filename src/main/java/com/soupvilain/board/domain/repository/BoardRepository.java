package com.soupvilain.board.domain.repository;

import com.soupvilain.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
