//package redis;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//  private final Logger LOG = LoggerFactory.getLogger(getClass());
//
//  @Autowired
//  private UserRepository userRepository;
//
//  @Cacheable(value = "users", key = "#userId", unless = "#result.followers < 12000")
//  @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
//  public Person getUser(@PathVariable String userId) {
//    LOG.info("Getting user with ID {}.", userId);
//      return userRepository.getOne(userId);
//  }
//}