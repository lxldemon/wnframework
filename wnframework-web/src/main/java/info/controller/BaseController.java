package info.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController {

	public abstract Map<String, Object> doList(@PathVariable String name);
}
