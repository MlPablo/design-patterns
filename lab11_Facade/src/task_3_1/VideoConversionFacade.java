package task_3_1;

public class VideoConversionFacade {
    public VideoFile convert(VideoFile file, Codec codec) {
        Codec sourceCodec = CodecFactory.extract(file);
        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile newVideoFile = BitrateReader.convert(buffer, file.getName(), codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, file.getAudioBuffer());

        return newVideoFile;
    }
}
