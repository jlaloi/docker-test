package fr.julien;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by julien on 27/03/16.
 */
@RepositoryRestResource(collectionResourceRel = "msg", path = "msg")
public interface MessageRepository extends PagingAndSortingRepository<Message, Long> {

}