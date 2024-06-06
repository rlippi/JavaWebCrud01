 package br.com.portfolio.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.portfolio.crud.entities.User;
import br.com.portfolio.crud.repositories.UserRepository;

@Configuration //mostra que é uma classe de configuração
@Profile("test") // mesmo nome utilizado no src/main/resources/application.properties)

public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Bob Grey", "bob@gmail.com", "966666666", "123456");
		User u4 = new User(null, "Anna White", "anna@gmail.com", "955555555", "123456");
		User u5 = new User(null, "John Black", "john@gmail.com", "944444444", "123456");
		User u6 = new User(null, "Emily Brown", "emily@gmail.com", "933333333", "123456");
		User u7 = new User(null, "Michael Smith", "michael@gmail.com", "922222222", "123456");
		User u8 = new User(null, "Laura Wilson", "laura@gmail.com", "911111111", "123456");
		User u9 = new User(null, "James Johnson", "james@gmail.com", "900000000", "123456");
		User u10 = new User(null, "Patricia Martinez", "patricia@gmail.com", "988888889", "123456");
		User u11 = new User(null, "Robert Anderson", "robert@gmail.com", "977777778", "123456");
		User u12 = new User(null, "Linda Thomas", "linda@gmail.com", "966666667", "123456");
		User u13 = new User(null, "David Jackson", "david@gmail.com", "955555556", "123456");
		User u14 = new User(null, "Barbara Thompson", "barbara@gmail.com", "944444445", "123456");
		User u15 = new User(null, "Daniel Garcia", "daniel@gmail.com", "933333334", "123456");
		User u16 = new User(null, "Susan Martinez", "susan@gmail.com", "922222223", "123456");
		User u17 = new User(null, "Matthew Robinson", "matthew@gmail.com", "911111112", "123456");
		User u18 = new User(null, "Jessica Clark", "jessica@gmail.com", "900000001", "123456");
		User u19 = new User(null, "Anthony Rodriguez", "anthony@gmail.com", "988888880", "123456");
		User u20 = new User(null, "Sarah Lewis", "sarah@gmail.com", "977777771", "123456");
		User u21 = new User(null, "Paul Lee", "paul@gmail.com", "966666662", "123456");
		User u22 = new User(null, "Karen Walker", "karen@gmail.com", "955555553", "123456");
		User u23 = new User(null, "Steven Hall", "steven@gmail.com", "944444444", "123456");
		User u24 = new User(null, "Nancy Allen", "nancy@gmail.com", "933333335", "123456");
		User u25 = new User(null, "Joshua Young", "joshua@gmail.com", "922222224", "123456");
		User u26 = new User(null, "Betty Hernandez", "betty@gmail.com", "911111113", "123456");
		User u27 = new User(null, "Justin King", "justin@gmail.com", "900000002", "123456");
		User u28 = new User(null, "Dorothy Wright", "dorothy@gmail.com", "988888881", "123456");
		User u29 = new User(null, "Kevin Lopez", "kevin@gmail.com", "977777772", "123456");
		User u30 = new User(null, "Sandra Scott", "sandra@gmail.com", "966666663", "123456");
		User u31 = new User(null, "Brian Adams", "brian@gmail.com", "955555554", "123456");
		User u32 = new User(null, "Ashley Nelson", "ashley@gmail.com", "944444446", "123456");
		User u33 = new User(null, "Edward Carter", "edward@gmail.com", "933333336", "123456");
		User u34 = new User(null, "Kimberly Perez", "kimberly@gmail.com", "922222225", "123456");
		User u35 = new User(null, "George Roberts", "george@gmail.com", "911111114", "123456");
		User u36 = new User(null, "Deborah Miller", "deborah@gmail.com", "900000003", "123456");
		User u37 = new User(null, "Kenneth Turner", "kenneth@gmail.com", "988888882", "123456");
		User u38 = new User(null, "Carol Phillips", "carol@gmail.com", "977777773", "123456");
		User u39 = new User(null, "Ronald Campbell", "ronald@gmail.com", "966666664", "123456");
		User u40 = new User(null, "Melissa Parker", "melissa@gmail.com", "955555555", "123456");
		User u41 = new User(null, "Jason Evans", "jason@gmail.com", "944444447", "123456");
		User u42 = new User(null, "Michelle Collins", "michelle@gmail.com", "933333337", "123456");
		User u43 = new User(null, "Larry Stewart", "larry@gmail.com", "922222226", "123456");
		User u44 = new User(null, "Rebecca Sanchez", "rebecca@gmail.com", "911111115", "123456");
		User u45 = new User(null, "Frank Morris", "frank@gmail.com", "900000004", "123456");
		User u46 = new User(null, "Sharon Rogers", "sharon@gmail.com", "988888883", "123456");
		User u47 = new User(null, "Eric Reed", "eric@gmail.com", "977777774", "123456");
		User u48 = new User(null, "Cynthia Cook", "cynthia@gmail.com", "966666665", "123456");
		User u49 = new User(null, "Stephen Morgan", "stephen@gmail.com", "955555556", "123456");
		User u50 = new User(null, "Angela Bell", "angela@gmail.com", "944444448", "123456");
		User u51 = new User(null, "Timothy Bailey", "timothy@gmail.com", "933333338", "123456");
		User u52 = new User(null, "Sandra Rivera", "sandra@gmail.com", "922222227", "123456");

		
		userRepository.saveAll(Arrays.asList(
				u1, u2, u3, u4, u5, u6, u7, u8, u9, u10,
	            u11, u12, u13, u14, u15, u16, u17, u18, u19, u20,
	            u21, u22, u23, u24, u25, u26, u27, u28, u29, u30,
	            u31, u32, u33, u34, u35, u36, u37, u38, u39, u40,
	            u41, u42, u43, u44, u45, u46, u47, u48, u49, u50,
	            u51, u52));
		
	}

		
}
