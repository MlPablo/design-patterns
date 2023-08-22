package task_3_1;

public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";

        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec());

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        VideoConversionFacade facade = new VideoConversionFacade();
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile videoFileConverted = facade.convert(videoFile, destinationCodec);

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");

        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
