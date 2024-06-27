package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.persistence;


public interface LectureApplicationJpaRepository extends JpaRepository<LectureApplication, LectureApplicationId> {


    List<LectureApplication> findByIdLectureSessionId(Long lectureSessionId);

    boolean existsByIdLectureSessionIdAndIdUserId(Long lectureSessionId, Long userId);

    List<LectureApplication> findAllByIdUserId(Long userId);
}
