package com.twitter.heron.spi.common;

public class Keys {

  public static String cluster() {
    return ConfigKeys.get("CLUSTER");
  }

  public static String role() {
    return ConfigKeys.get("ROLE");
  }

  public static String environ() {
    return ConfigKeys.get("ENVIRON");
  }

  public static String verbose() {
    return ConfigKeys.get("VERBOSE");
  }

  public static String configPath() {
    return ConfigKeys.get("CONFIG_PATH");
  }

  public static String topologyId() {
    return ConfigKeys.get("TOPOLOGY_ID");
  }

  public static String topologyName() {
    return ConfigKeys.get("TOPOLOGY_NAME");
  }

  public static String topologyDefinition() {
    return ConfigKeys.get("TOPOLOGY_DEFINITION");
  }

  public static String topologyPackageUri() {
    return ConfigKeys.get("TOPOLOGY_PACKAGE_URI");
  }

  public static String uploaderClass() {
    return ConfigKeys.get("UPLOADER_CLASS");
  }

  public static String launcherClass() {
    return ConfigKeys.get("LAUNCHER_CLASS");
  }

  public static String schedulerClass() {
    return ConfigKeys.get("SCHEDULER_CLASS");
  }

  public static String runtimeManagerClass() {
    return ConfigKeys.get("RUNTIME_MANAGER_CLASS");
  }

  public static String packingClass() {
    return ConfigKeys.get("PACKING_CLASS");
  }

  public static String stateManagerClass() {
    return ConfigKeys.get("STATE_MANAGER_CLASS");
  }

  public static String schedulerJar() {
    return ConfigKeys.get("SCHEDULER_JAR");
  }

  public static String schedulerProxyConnectionString() {
    return ConfigKeys.get("SCHEDULER_PROXY_CONNECTION_STRING");
  }

  public static String schedulerProxyConnectionType() {
    return ConfigKeys.get("SCHEDULER_PROXY_CONNECTION_TYPE");
  }

  public static String stateManagerConnectionString() {
    return ConfigKeys.get("STATEMGR_CONNECTION_STRING");
  }

  public static String stateManagerRootPath() {
    return ConfigKeys.get("STATEMGR_ROOT_PATH");
  }

  public static String corePackageUri() {
    return ConfigKeys.get("CORE_PACKAGE_URI");
  }

  public static String clusterFile() {
    return ConfigKeys.get("CLUSTER_YAML");
  }

  public static String clientFile() {
    return ConfigKeys.get("CLIENT_YAML");
  }

  public static String defaultsFile() {
    return ConfigKeys.get("DEFAULTS_YAML");
  }

  public static String metricsSinksFile() {
    return ConfigKeys.get("METRICS_YAML");
  }

  public static String packingFile() {
    return ConfigKeys.get("PACKING_YAML");
  }

  public static String schedulerFile() {
    return ConfigKeys.get("SCHEDULER_YAML");
  }

  public static String stateManagerFile() {
    return ConfigKeys.get("STATEMGR_YAML");
  }

  public static String systemFile() {
    return ConfigKeys.get("SYSTEM_YAML");
  }

  public static String uploaderFile() {
    return ConfigKeys.get("UPLOADER_YAML");
  }

  public static String topologyDefinitionFile() {
    return ConfigKeys.get("TOPOLOGY_DEFINITION_FILE");
  }

  public static String topologyJarFile() {
    return ConfigKeys.get("TOPOLOGY_JAR_FILE");
  }

  public static String topologyPackageFile() {
    return ConfigKeys.get("TOPOLOGY_PACKAGE_FILE");
  }

  public static String topologyPackageType() {
    return ConfigKeys.get("TOPOLOGY_PACKAGE_TYPE");
  }

  public static String topologyContainerId() {
    return ConfigKeys.get("TOPOLOGY_CONTAINER_ID");
  }

  public static String stmgrRam() {
    return ConfigKeys.get("STMGR_RAM");
  }

  public static String instanceRam() {
    return ConfigKeys.get("INSTANCE_RAM");
  }

  public static String instanceCpu() {
    return ConfigKeys.get("INSTANCE_CPU");
  }

  public static String instanceDisk() {
    return ConfigKeys.get("INSTANCE_DISK");
  }

  public static String heronHome() {
    return ConfigKeys.get("HERON_HOME");
  }

  public static String heronBin() {
    return ConfigKeys.get("HERON_BIN");
  }

  public static String heronConf() {
    return ConfigKeys.get("HERON_CONF");
  }

  public static String heronLib() {
    return ConfigKeys.get("HERON_LIB");
  }

  public static String heronDist() {
    return ConfigKeys.get("HERON_DIST");
  }

  public static String heronEtc() {
    return ConfigKeys.get("HERON_ETC");
  }

  public static String instanceClassPath() {
    return ConfigKeys.get("INSTANCE_CLASSPATH");
  }

  public static String metricsManagerClassPath() {
    return ConfigKeys.get("METRICSMGR_CLASSPATH");
  }

  public static String packingClassPath() {
    return ConfigKeys.get("PACKING_CLASSPATH");
  }

  public static String schedulerClassPath() {
    return ConfigKeys.get("SCHEDULER_CLASSPATH");
  }

  public static String stateManagerClassPath() {
    return ConfigKeys.get("STATEMGR_CLASSPATH");
  }

  public static String uploaderClassPath() {
    return ConfigKeys.get("UPLOADER_CLASSPATH");
  }

  public static String topologyClassPath() {
    return ConfigKeys.get("TOPOLOGY_CLASSPATH");
  }

  public static String schedulerStateManagerAdaptor() {
    return ConfigKeys.get("SCHEDULER_STATE_MANAGER_ADAPTOR");
  }

  public static String packingClassInstance() {
    return ConfigKeys.get("PACKING_CLASS_INSTANCE");
  }

  public static String launcherClassInstance() {
    return ConfigKeys.get("LAUNCHER_CLASS_INSTANCE");
  }

  public static String runtimeManagerClassInstance() {
    return ConfigKeys.get("RUNTIME_MANAGER_CLASS_INSTANCE");
  }

  public static String schedulerShutdown() {
    return ConfigKeys.get("SCHEDULER_SHUTDOWN");
  }

  public static String componentRamMap() {
    return ConfigKeys.get("COMPONENT_RAMMAP");
  }

  public static String componentJvmOpts() {
    return ConfigKeys.get("COMPONENT_JVM_OPTS_IN_BASE64");
  }

  public static String instanceDistribution() {
    return ConfigKeys.get("INSTANCE_DISTRIBUTION");
  }

  public static String instanceJvmOpts() {
    return ConfigKeys.get("INSTANCE_JVM_OPTS_IN_BASE64");
  }

  public static String numContainers() {
    return ConfigKeys.get("NUM_CONTAINERS");
  }

  public static String javaHome() {
    return ConfigKeys.get("JAVA_HOME");
  }

  public static String heronSandboxHome() {
    return ConfigKeys.get("HERON_SANDBOX_HOME");
  }

  public static String heronSandboxBin() {
    return ConfigKeys.get("HERON_SANDBOX_BIN");
  }

  public static String heronSandboxConf() {
    return ConfigKeys.get("HERON_SANDBOX_CONF");
  }

  public static String heronSandboxLib() {
    return ConfigKeys.get("HERON_SANDBOX_LIB");
  }

  public static String javaSandboxHome() {
    return ConfigKeys.get("HERON_SANDBOX_JAVA_HOME");
  }

  public static String clusterSandboxFile() {
    return ConfigKeys.get("SANDBOX_CLUSTER_YAML");
  }

  public static String defaultsSandboxFile() {
    return ConfigKeys.get("SANDBOX_DEFAULTS_YAML");
  }

  public static String metricsSinksSandboxFile() {
    return ConfigKeys.get("SANDBOX_METRICS_YAML");
  }

  public static String packingSandboxFile() {
    return ConfigKeys.get("SANDBOX_PACKING_YAML");
  }

  public static String schedulerSandboxFile() {
    return ConfigKeys.get("SANDBOX_SCHEDULER_YAML");
  }

  public static String stateManagerSandboxFile() {
    return ConfigKeys.get("SANDBOX_STATEMGR_YAML");
  }

  public static String systemSandboxFile() {
    return ConfigKeys.get("SANDBOX_SYSTEM_YAML");
  }

  public static String uploaderSandboxFile() {
    return ConfigKeys.get("SANDBOX_UPLOADER_YAML");
  }

  public static String executorSandboxBinary() {
    return ConfigKeys.get("SANDBOX_EXECUTOR_BINARY");
  }

  public static String stmgrSandboxBinary() {
    return ConfigKeys.get("SANDBOX_STMGR_BINARY");
  }

  public static String tmasterSandboxBinary() {
    return ConfigKeys.get("SANDBOX_TMASTER_BINARY");
  }

  public static String shellSandboxBinary() {
    return ConfigKeys.get("SANDBOX_SHELL_BINARY");
  }

  public static String schedulerSandboxJar() {
    return ConfigKeys.get("SANDBOX_SCHEDULER_JAR");
  }

  public static String logSandboxDirectory() {
    return ConfigKeys.get("SANDBOX_LOGGING_DIRECTORY");
  }

  public static String instanceSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_INSTANCE_CLASSPATH");
  }

  public static String metricsManagerSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_METRICSMGR_CLASSPATH");
  }

  public static String packingSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_PACKING_CLASSPATH");
  }

  public static String schedulerSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_SCHEDULER_CLASSPATH");
  }

  public static String stateManagerSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_STATEMGR_CLASSPATH");
  }

  public static String uploaderSandboxClassPath() {
    return ConfigKeys.get("SANDBOX_UPLOADER_CLASSPATH");
  }
}
