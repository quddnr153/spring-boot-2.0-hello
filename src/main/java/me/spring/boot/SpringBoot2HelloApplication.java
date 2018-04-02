package me.spring.boot;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringBoot2HelloApplication {

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@Autowired
	private WebClient.Builder webClientBuilder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2HelloApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			// restTemplate version
//			StopWatch stopWatch = new StopWatch();
//			stopWatch.start();
//
//			RestTemplate restTemplate = restTemplateBuilder.build();
//
//			GitRepository[] gitRepositories = restTemplate.getForObject("https://api.github.com/users/quddnr153/repos", GitRepository[].class);
//
//			Arrays.stream(gitRepositories).forEach(gitRepository -> {
//				System.out.println("repo: " + gitRepository.getUrl());
//			});
//
//			GitCommit[] commits = restTemplate.getForObject("https://api.github.com/repos/quddnr153/acmicpc/commits", GitCommit[].class);
//
//			Arrays.stream(commits).forEach(c -> {
//				System.out.println("commit : " + c.getSha());
//			});
//
//			stopWatch.stop();
//			System.out.println(stopWatch.prettyPrint());


			// Mono version
//			StopWatch stopWatch = new StopWatch();
//			stopWatch.start();
//
//			WebClient webClient = webClientBuilder.baseUrl("https://api.github.com").build();
//
//			Mono<GitRepository[]> repositoryFlux = webClient.get().uri("/users/quddnr153/repos")
//					.retrieve()
//					.bodyToMono(GitRepository[].class);
//
//			Mono<GitCommit[]> commitFlux = webClient.get().uri("/repos/quddnr153/acmicpc/commits")
//					.retrieve()
//					.bodyToMono(GitCommit[].class);
//
//			repositoryFlux.doOnSuccess(ra -> {
//				Arrays.stream(ra).forEach(r -> {
//					System.out.println("repo: " + r.getUrl());
//				});
//			}).subscribe();
//
//			commitFlux.doOnSuccess(ca -> {
//				Arrays.stream(ca).forEach(c -> {
//					System.out.println("Commit: " + c.getSha());
//				});
//			}).subscribe();
//
//			stopWatch.stop();
//			System.out.println(stopWatch.prettyPrint());


			// flux version
			StopWatch stopWatch = new StopWatch();
			stopWatch.start();

			WebClient webClient = webClientBuilder.baseUrl("https://api.github.com").build();

			Flux<GitRepository> repositoryFlux = webClient.get().uri("/users/quddnr153/repos")
					.retrieve()
					.bodyToFlux(GitRepository.class);

			Flux<GitCommit> commitFlux = webClient.get().uri("/repos/quddnr153/acmicpc/commits")
					.retrieve()
					.bodyToFlux(GitCommit.class);

			repositoryFlux.subscribe(ra -> System.out.println("repo: " + ra.getUrl()));

			commitFlux.subscribe(ca -> System.out.println("Commit: " + ca.getSha()));

			stopWatch.stop();
			System.out.println(stopWatch.prettyPrint());
		};
	}
}
