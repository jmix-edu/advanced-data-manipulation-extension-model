package com.company.autoconfigure.inventorycontrolsystem;

import com.company.inventorycontrolsystem.IcsConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({IcsConfiguration.class})
public class IcsAutoConfiguration {
}

