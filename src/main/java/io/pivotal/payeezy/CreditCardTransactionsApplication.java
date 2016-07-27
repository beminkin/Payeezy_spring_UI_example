package io.pivotal.payeezy;

import com.firstdata.payeezy.PayeezyAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(PayeezyAppConfig.class)
public class CreditCardTransactionsApplication {

	public static void main(String[] args) {
        SpringApplication.run(CreditCardTransactionsApplication.class, args);
    }
}
