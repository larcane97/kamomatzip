package com.frankie.kamomatzip.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.vault.annotation.VaultPropertySource;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

@Configuration
@VaultPropertySource(value = {
        "secret/navi-onboarding/navi-data-accident/db_info"
})
@Import(value = EnvironmentVaultConfiguration.class)
public class VaultConfig
{
}
