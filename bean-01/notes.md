### Class Relationships
BeanDefinition <--depend-- BeanFactory <--use-- UserServiceTest

### Implementation
ConcurrentHashMap as the dedicated container for storing beans
Use `bean's name` as the key, and the value of `BeanDefinition` instance 