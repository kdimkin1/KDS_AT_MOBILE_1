package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {

    // caps.setCapability: "browserstack.user"
    String user();
    // caps.setCapability: "browserstack.user"
    String key();
    // caps.setCapability: "app"
    String app();
    //URL("http://hub.browserstack.com/wd/hub");
    String url();

}