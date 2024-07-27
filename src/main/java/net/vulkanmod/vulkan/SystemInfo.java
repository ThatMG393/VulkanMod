package net.vulkanmod.vulkan;

public class SystemInfo {
    public static final String cpuInfo;
    
    static {
        try {
            cpuInfo = new oshi.SystemInfo().getHardware().getProcessor().getProcessorIdentifier().getName().replaceAll("\\s+", " ");
        } catch (Exception e) {
            cpuInfo = "Unknown CPU";
        }
    }
}
