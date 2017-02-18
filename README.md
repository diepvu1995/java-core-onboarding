# java-core-onboarding

Anotation Name | Description | Type | Example
----------- | ---------------------- | ------------ | --------------------------------------------------
@Componment | Xác định một Bean được tạo ra cho một Class và được quản lý trong Application Context  | Automatically | @Component public class SgtPeppers implements CompactDisc {} |
@Configuration | Chú thích cho một lớp cấu hình | Automatically, java, Mix | @Configuration @ComponentScan public class CDPlayerConfig{} |
@ComponmentScan | Quét và phát hiện các Componment trong Spring | Automatically | @Configuration @ComponentScan public class CDPlayerConfig{} |
@RunWith | Dùng trong lớp Test, và truyền vào class SpringJUnit4ClassRunner của Spring. | Automatically, java | @RunWith( SpringJUnit4ClassRunner.class ) @ContextConfiguration(classes=CDPlayerConfig.class) public class CDPlayerTest {} |
@ContextConfiguration(classes=CDPlayerConfig.class) | Dùng trong lớp Test, truyền vào lớp cấu hình đã khai báo. | Automatically, java | 
@Named | Giống @Componment, nhưng thuộc Java Dependency Injection | Automatically	| @Named public class CDPlayer { ... @Inject public CDPlayer(CompactDisc cd) { this.cd = cd; }} |
@Inject	| Giống @Autowired, nhưng thuộc Java Dependency Injection	| Automatically |
@Autowired	| Dùng để tự động tìm một bean trong Application Context để đáp ứng phụ thuộc của một Bean ở thời điểm tạo. Được sử dụng không giới hạn. | Automatically, XML	| @Autowired public CDPlayer(CompactDisc cd) { this.cd = cd; } |
@Autowired( required=false)	| Dùng để tránh những lỗi ngoại lệ khi Spring chưa match được các Bean. Nếu không tìm dependence thì dependence là Null và không báo lỗi.	| Automatically	| @Autowired(required=false) public CDPlayer(CompactDisc cd) { this.cd = cd; } |
@Bean	| Nói cho Spring biết một hàm sẽ trả về một đối tượng được hiểu như là một Bean trong Spring application context 	| Java, Mix	| @Bean public CompactDisc sgtPeppers() { return new SgtPeppers(); } |
@Import(CDConfig.class)	| Import các bean được khai báo theo kiểu java của một lớp khác đến lớp hiện tại.	| Import JavaConfig |	@Configuration @Import(CDConfig.class) public class CDPlayerConfig { @Bean public CDPlayer cdPlayer(CompactDisc compactDisc) { return new CDPlayer(compactDisc); }} |
@ImportResource("classpath:cd-config.xml")	|Chú thích khai báo file cấu hình XMl trong lớp config	| Mix (Referencing XML configuration in JavaConfig/Automatic) |


