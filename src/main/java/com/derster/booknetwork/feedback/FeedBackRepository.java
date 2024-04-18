package com.derster.booknetwork.feedback;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Integer> {

    @Query(
            """
            SELECT feeback
            FROM FeedBack feeback
            WHERE feeback.book.id = :bookId
            """
    )
    Page<FeedBack> findAllByBookId(Integer bookId, Pageable pageable);
}
