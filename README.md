# GitChat

Chat with any GitHub repository using AI. Ask questions about the codebase and get answers with citations.

## Tech Stack

- **Backend:** Spring Boot 4.1 · Java 21
- **Frontend:** Next.js · React · Tailwind CSS · shadcn/ui
- **Auth:** GitHub OAuth2
- **AI:** RAG-based code retrieval with streaming chat responses

## Features

- GitHub OAuth login
- Index any GitHub repo (chunked code indexing)
- Chat with indexed repos via AI (streamed responses)
- Citations back to source files

## Getting Started

**Backend**

```bash
cd backend
./mvnw spring-boot:run
```

**Frontend**

```bash
cd client
npm install
npm run dev
```

Configure `application.yml` with your GitHub OAuth credentials and AI provider settings.
