package org.{{ cookiecutter.project_subdomain }}.com.config

final case class ApplicationConfig(opsServerConfig: OpsServerConfig, restConfig: RestApiConfig)

final case class RestApiConfig(port: Int)
final case class OpsServerConfig(port: Int)